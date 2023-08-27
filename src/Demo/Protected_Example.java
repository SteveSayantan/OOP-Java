package Demo;

import Code.access_modifiers.AccessFile;

public class Protected_Example extends AccessFile {
    
    public static void main(String[] args) {
        Protected_Example temp= new Protected_Example();

        AccessFile test= new Protected_Example();

        AccessFile demo= new AccessFile();

        System.out.println(temp.isHappy);       // can be accessed

        // System.out.println(test.isHappy);   // can not be accessed, as only child class of AccessFile can access it when inside different package.

        // System.out.println(demo.isHappy);   // can not be accessed, only child class of AccessFile can access it when inside different package .

        /* 
            The parent class (AccessFile) does not know about the child class (Protected_Example). Therefore, the ref_variable must be of type child class for accessing proctected members.

            If last two implementations were valid, there would not be any difference between public and protected. We could apply this trick everywhere to access protected members.
        */
    }
}
