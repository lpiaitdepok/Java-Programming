public class Puppy {
   // Constructors
   public Puppy() {
   }

   public Puppy(String name) {
      // This constructor has one parameter, name.
   }
   
      public static void main(String []args) {
	// There are three steps when creating an object from a class −

    // Declaration − A variable declaration with a variable name with an object type.

    // Instantiation − The 'new' keyword is used to create the object.

    // Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.

      // Following statement would create an object myPuppy
      Puppy myPuppy = new Puppy( "tommy" );
   }
}