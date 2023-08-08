package structural_design_patterns.adapter;

public class Prototype implements FileType{
    public Prototype(){};
    public Prototype(String data){}
    XML convertToXML(){
        // logic to convert the data to XML
        System.out.println("prototype converted to xml");
        return new XML("Stringified prototype data");
    }
}
