package SampleCheck;

public class APITest004_BuilderPatternDesignPattern {
    // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference

    public APITest004_BuilderPatternDesignPattern step1() {
        System.out.println("Step 1 is started");
        System.out.println("Step 1 is done");
        return this;
    }

    public APITest004_BuilderPatternDesignPattern step2() {
        System.out.println("Step 2 is started");
        System.out.println("Step 2 is done");
        return this;
    }

    public APITest004_BuilderPatternDesignPattern step3(String name) {
        System.out.println("Step 2 is started");
        System.out.println("Step 2 is done -> " + name);
        return this;
    }

    public static void main(String[] args) {
        APITest004_BuilderPatternDesignPattern bp = new APITest004_BuilderPatternDesignPattern();
        bp.step1().step2().step3("Pramod");
    }


}

