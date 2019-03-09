package com.aspose.barcode.examples.barcode.basic_features;

import java.awt.Color;
import java.io.IOException;

import com.aspose.barcode.examples.Utils;
import com.aspose.barcode.generation.BarCodeGenerator;

public class CodeTextForegroundColor {

	public static void main(String[] args) throws IOException {
		//ExStart: CodeTextForegroundColor
		// The path to the resource directory.
    	String dataDir = Utils.getDataDir(CodeTextForegroundColor.class) + "Barcode/BasicFeatures/";
    	
    	// Create instance of BarCodeGenerator, specify codetext and symbology in the constructor
    	BarCodeGenerator generator = new BarCodeGenerator(com.aspose.barcode.EncodeTypes.CODE_128, "12345678");
		
    	//Set up code text color
    	generator.getCodeTextStyle().setColor(Color.RED);
		
		//Save the Barcode image to file
    	generator.save(dataDir + "codeTextForegroundColor.jpg");
    	//ExEnd: CodeTextForegroundColor
	}

}
