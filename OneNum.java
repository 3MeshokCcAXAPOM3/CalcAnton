class OneNum {

    public static int oneNum(String input) {
        UserValidation userValidation = new UserValidation();
        int ferstNum = 0;
        int secondNum = 0;
        int result = 0;
        String[] nums = {};
        String x = input.replaceAll(" ", "");

        if (x.contains("+")) {
            nums = x.split("\\+");
            for (int i = 0; i < nums.length; i++) {
                try {
                    ferstNum = Integer.parseInt(nums[0]);
                    secondNum = Integer.parseInt(nums[1]);
                }catch (NumberFormatException e){
                    System.out.println("Введите корректное значение");
                    System.exit(1);
                }userValidation.validation(ferstNum,secondNum);
                result = ferstNum + secondNum;
            }

        } else if (x.contains("-")) {
            nums = x.split("-");
            for (int i = 0; i < nums.length; i++) {
                try {
                    ferstNum = Integer.parseInt(nums[0]);
                    secondNum = Integer.parseInt(nums[1]);
                }catch (NumberFormatException e){
                    System.out.println("Введите корректное значение");
                    System.exit(1);
                }userValidation.validation(ferstNum,secondNum);
                result = ferstNum - secondNum;
            }
        } else if (x.contains("*")) {
            nums = x.split("\\*");
            for (int i = 0; i < nums.length; i++) {
                try {
                    ferstNum = Integer.parseInt(nums[0]);
                    secondNum = Integer.parseInt(nums[1]);
                }catch (NumberFormatException e){
                    System.out.println("Введите корректное значение");
                    System.exit(1);
                }userValidation.validation(ferstNum,secondNum);
                result = ferstNum * secondNum;
            }
        } else if (x.contains("/")) {
            nums = x.split("/");
            for (int i = 0; i < nums.length; i++) {
                try {
                    ferstNum = Integer.parseInt(nums[0]);
                    secondNum = Integer.parseInt(nums[1]);
                }catch (NumberFormatException e){
                    System.out.println("Введите корректное значение");
                    System.exit(1);
                }userValidation.validation(ferstNum,secondNum);
                result = ferstNum / secondNum;
            }
        }else {
            try {
                throw new MyException("");
            }catch (MyException e){
                System.out.println("Не верный символ вычисления");
                System.exit(1);
            }
        }
        System.out.println(result);
        return result;
    }
}


