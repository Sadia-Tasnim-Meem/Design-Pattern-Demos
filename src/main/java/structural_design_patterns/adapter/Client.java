package structural_design_patterns.adapter;

public class Client {
    public static void main(String[] args) {
        JSON json = new JSON("json data");
        IAdapter iAdapter = new JsonToXmlAdapter(json);
        XML xml = iAdapter.convert(json);
        System.out.println("");

        Prototype prototype = new Prototype("proto data");
        iAdapter = new PrototypeToXmlAdapter(prototype);
        xml = iAdapter.convert(prototype);

    }

}
