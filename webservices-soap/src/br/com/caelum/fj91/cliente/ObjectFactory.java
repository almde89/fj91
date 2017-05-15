
package br.com.caelum.fj91.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.fj91.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Traduz_QNAME = new QName("http://ws.caelum.com.br/", "traduz");
    private final static QName _AdicionaTraducaoResponse_QNAME = new QName("http://ws.caelum.com.br/", "adicionaTraducaoResponse");
    private final static QName _AdicionaTraducao_QNAME = new QName("http://ws.caelum.com.br/", "adicionaTraducao");
    private final static QName _TraduzResponse_QNAME = new QName("http://ws.caelum.com.br/", "traduzResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.fj91.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Traduz }
     * 
     */
    public Traduz createTraduz() {
        return new Traduz();
    }

    /**
     * Create an instance of {@link AdicionaTraducao }
     * 
     */
    public AdicionaTraducao createAdicionaTraducao() {
        return new AdicionaTraducao();
    }

    /**
     * Create an instance of {@link AdicionaTraducaoResponse }
     * 
     */
    public AdicionaTraducaoResponse createAdicionaTraducaoResponse() {
        return new AdicionaTraducaoResponse();
    }

    /**
     * Create an instance of {@link TraduzResponse }
     * 
     */
    public TraduzResponse createTraduzResponse() {
        return new TraduzResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Traduz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.caelum.com.br/", name = "traduz")
    public JAXBElement<Traduz> createTraduz(Traduz value) {
        return new JAXBElement<Traduz>(_Traduz_QNAME, Traduz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionaTraducaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.caelum.com.br/", name = "adicionaTraducaoResponse")
    public JAXBElement<AdicionaTraducaoResponse> createAdicionaTraducaoResponse(AdicionaTraducaoResponse value) {
        return new JAXBElement<AdicionaTraducaoResponse>(_AdicionaTraducaoResponse_QNAME, AdicionaTraducaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionaTraducao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.caelum.com.br/", name = "adicionaTraducao")
    public JAXBElement<AdicionaTraducao> createAdicionaTraducao(AdicionaTraducao value) {
        return new JAXBElement<AdicionaTraducao>(_AdicionaTraducao_QNAME, AdicionaTraducao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraduzResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.caelum.com.br/", name = "traduzResponse")
    public JAXBElement<TraduzResponse> createTraduzResponse(TraduzResponse value) {
        return new JAXBElement<TraduzResponse>(_TraduzResponse_QNAME, TraduzResponse.class, null, value);
    }

}
