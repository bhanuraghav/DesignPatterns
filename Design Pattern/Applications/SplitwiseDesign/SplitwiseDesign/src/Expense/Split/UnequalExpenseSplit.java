package Expense.Split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit{

    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) throws Exception {

        double amountInSplits =0;

        for (Split split : splitList){
            amountInSplits += split.getAmountOwe();
        }

        if(amountInSplits != totalAmount){
            throw new Exception("Split sum not equal to total amount");
        }


    }
}
