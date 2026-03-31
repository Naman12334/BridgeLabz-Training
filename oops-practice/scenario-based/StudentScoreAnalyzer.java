class InvalidScoreException extends Exception{
    InvalidScoreException(String msg){
        super(msg);
    }
}

public class StudentScoreAnalyzer{

    static double calculateAverage(int[] a)throws InvalidScoreException{
        int sum=0;
        for(int x:a){
            validate(x);
            sum+=x;
        }
        return (double)sum/a.length;
    }

    static int findMax(int[] a)throws InvalidScoreException{
        int max=a[0];
        for(int x:a){
            validate(x);
            if(x>max)
                max=x;
        }
        return max;
    }

    static int findMin(int[] a)throws InvalidScoreException{
        int min=a[0];
        for(int x:a){
            validate(x);
            if(x<min)
                min=x;
        }
        return min;
    }

    static void validate(int x)throws InvalidScoreException{
        if(x<0 || x>100)
            throw new InvalidScoreException("Invalid Score: "+x);
    }

    public static void main(String[] args){
        int[] sc={78,85,90,66,88};

        try{
            System.out.println("Average = "+calculateAverage(sc));
            System.out.println("Highest = "+findMax(sc));
            System.out.println("Lowest = "+findMin(sc));
        }
        catch(InvalidScoreException e){
            System.out.println(e.getMessage());
        }
    }
}
