package structural_design_patterns.adapter;

public class JSON implements FileType{

    public JSON(){};
    public JSON(String data){}
    XML convertToXML(){
        // logic to convert the data to XML
        System.out.println("json converted to xml");
        return new XML("Stringified JSON data");
    }
}
