package Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{

    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) throws Exception {

        double amountShouldBePresent = totalAmount/splitList.size();

        for (Split split : splitList){
            if (split.getAmountOwe() != amountShouldBePresent){
                throw new Exception("Not equal amount split");
            }
        }


    }
}
