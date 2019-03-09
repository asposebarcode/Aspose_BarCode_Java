package com.aspose.barcode.examples.barcode_image.utility_features;

import com.aspose.barcode.examples.Utils;
import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarCodeGenerator;

import java.io.IOException;

public class GetMinimumBarCodeSize 
{
    public static void main(String[] args) throws IOException {
    	//ExStart: GetMinimumBarCodeSize
    	// The path to the resource directory.
    	String dataDir = Utils.getDataDir(BarcodeCustomSize.class) + "BarcodeImage/UtilityFeatures/";

    	//Instantiate barcode object, Set the symbology type to code128 and Set the Code text for the barcode
        BarCodeGenerator bb = new BarCodeGenerator(com.aspose.barcode.EncodeTypes.CODE_128, "1234567");
        
        
        bb.setAutoSizeMode(AutoSizeMode.NONE);

        // Set image height & width to minimum
        bb.getBarCodeWidth().setMillimeters(1);
        bb.getBarCodeHeight().setMillimeters(1);
        
        // Save the barcode image
        javax.imageio.ImageIO.write( bb.generateBarCodeImage(), "PNG", new java.io.File("minimumresult.png") );
        //ExEnd: GetMinimumBarCodeSize
    }
}
