package structural_design_patterns.adapter;

public class JsonToXmlAdapter implements IAdapter{
    private JSON json;

    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }

    @Override
    public XML convert(FileType json) {
        return this.json.convertToXML();
    }
}
