package dnd;

public class Cube {
    protected int[] result_args = new int[3];
    protected int result;

    public int random() {
        this.result =0;
        int s = 0;
        int[] arg = new int[6];
        for (int i = 0; i < arg.length; i++) {

            arg[i] = s;
            //System.out.println(arg[i]);
        }
        int max = 6;
        s = (int) (Math.random() * (6) + 1);
        int numberOperation = 0;
        while (numberOperation < 3) {
            for (int i = 0; i < arg.length; i++) {
                if (numberOperation == 3) {
                    break;
                }
                if (arg[i] == max) {
                    result_args[numberOperation] = arg[i];
                    ++numberOperation;
                }
            }
            max--;
        }
        return count_result();
    }

    public int count_result() {
        for (int i = 0; i < this.result_args.length; i++) {
            this.result = this.result + this.result_args[i];
        }
        return this.result;
    }
    public void printResult(){
        System.out.println(result);
    }

    public int getResult() {
        return this.result;
    }
}

