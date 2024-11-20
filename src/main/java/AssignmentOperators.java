public class AssignmentOperators {
    public AssignmentOperators(){
        //Assignment primitive values
        int j,k;
        j = 10; // j get the value 10
        j = 5; // j get the value 5.  previous value is over written
        k = j;
        System.out.println("j  is: " + j);
        System.out.println("k is: " + k);

        //multiple Assignments

        k = j = 10; //k = (j=10)
        System.out.println("j is :" + j);
        System.out.println("k is : " + k);


    }
}
