package structural_design_patterns.adapter;

public class PrototypeToXmlAdapter implements IAdapter{
    private Prototype prototype;

    public PrototypeToXmlAdapter(Prototype prototype){
        this.prototype = prototype;
    }

    @Override
    public XML convert(FileType prototype) {
        return this.prototype.convertToXML();
    }
}
