/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C://Users/braij/Dropbox/Documents/PictureFilters/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testUnderwater() {
    Picture swan = new Picture("C://Users/braij/Dropbox/Documents/PictureFilters/src/images/swan.jpg");
    swan.explore();
    swan.underwater();
    swan.explore();
  }

  public static void testGrayscale() {
      Picture arch = new Picture("C://Users/braij/Dropbox/Documents/PictureFilters/src/images/arch.jpg");
      arch.explore();
      arch.grayscale();
      arch.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C://Users/braij/Dropbox/Documents/PictureFilters/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C://Users/braij/Dropbox/Documents/PictureFilters/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testNegate() {
      Picture temple = new Picture("C://Users/braij/Dropbox/Documents/PictureFilters/src/images/temple.jpg");
      temple.explore();
      temple.negate();
      temple.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testFixUnderwater() {
      Picture water = new Picture("C://Users/braij/Dropbox/Documents/PictureFilters/src/images/water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testUnderwater();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}