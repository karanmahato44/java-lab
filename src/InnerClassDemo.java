class InnerClassDemo {
    public static void main(String[] args) {
        Outer.StaticInner staticInnerObj = new Outer.StaticInner();
        System.out.println(staticInnerObj.message);

        Outer outerObj = new Outer();
        Outer.Inner innerObj = new Outer.Inner();
        // Outer.PrivateInner privateInnerObj = outerObj.new PrivateInner();

        // System.out.println(privateInnerObj.secret);
        System.out.println(outerObj.fname);
        System.out.println(innerObj.lname);
    }
}

class Outer {
    String fname = "lorem";

    static class Inner {
        String lname = "ipsum";
    }

    static class StaticInner {
        String message = "From static Inner class";
    }
}

/*

private class PrivateInner {
    String secret = "password";
}

*/
