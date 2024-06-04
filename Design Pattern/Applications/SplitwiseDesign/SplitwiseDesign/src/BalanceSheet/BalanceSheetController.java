package BalanceSheet;

import Expense.Split.Split;
import User.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User expensePaidByUser, List<Split> splits,double totalExpenseAmount){

        //update the total amount paid of the expense paid by user
        UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidByUser.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment()+totalExpenseAmount);

        for (Split split : splits){

            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserExpenseBalanceSheet = userOwe.getUserExpenseBalanceSheet();

            double oweAmount = split.getAmountOwe();

            if(expensePaidByUser.getUserId().equals(userOwe.getUserId())){
                paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense() + oweAmount);
            }
            else{

                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYouGetBack() + oweAmount);

                Balance userOweBalance;
                if(paidByUserExpenseSheet.getUserVsBalance().containsKey(userOwe.getUserId())){
                    userOweBalance = paidByUserExpenseSheet.getUserVsBalance().get(userOwe.getUserId());
                }
                else{
                    userOweBalance = new Balance();
                    paidByUserExpenseSheet.getUserVsBalance().put(userOwe.getUserId(),userOweBalance);
                }

                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack()  + oweAmount);

                //update the balance sheet of owe user
                oweUserExpenseBalanceSheet.setTotalYouOwe(oweUserExpenseBalanceSheet.getTotalYouOwe() + oweAmount);
                oweUserExpenseBalanceSheet.setTotalYourExpense(oweUserExpenseBalanceSheet.getTotalYourExpense() + oweAmount);

                Balance userPaidBalance;
                if(oweUserExpenseBalanceSheet.getUserVsBalance().containsKey(expensePaidByUser.getUserId())){
                    userPaidBalance = oweUserExpenseBalanceSheet.getUserVsBalance().get(expensePaidByUser.getUserId());
                }
                else{
                    userPaidBalance = new Balance();
                    oweUserExpenseBalanceSheet.getUserVsBalance().put(expensePaidByUser.getUserId(), userPaidBalance);
                }
                userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + oweAmount);
            }
        }
    }

    public void showBalanceSheetOfUser(User user){

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet =  user.getUserExpenseBalanceSheet();

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("TotalPaymnetMade: " + userExpenseBalanceSheet.getTotalPayment());
        for(Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserVsBalance().entrySet()){

            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");
    }
}
