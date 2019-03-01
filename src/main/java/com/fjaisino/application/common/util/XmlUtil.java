package com.fjaisino.application.common.util;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * <P>Description: </p>
 *
 * @Auther cye
 * @Date 2018/11/10 10:38
 */
public class XmlUtil {
    /**
     * 将xml文件转成JavaBean
     * @param xml
     * @param c
     * @param <T>
     * @return
     * @throws JAXBException
     */
    public static <T> T convertToJavaBean(String xml, Class<T> c)
            throws JAXBException {
        T t = null;
        JAXBContext context = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        t = (T) unmarshaller.unmarshal(new StringReader(xml));
        return t;
    }

    /**
     * JavaBean转换成xml 默认编码UTF-8
     *
     * @param obj
     * @return
     */
    public static String convertToXml(Object obj) {
        return convertToXml(obj, "GBK");
    }

    /**
     * JavaBean转换成xml
     *
     * @param obj
     * @param encoding
     * @return
     */
    public static String convertToXml(Object obj, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xml头信息
            MarshallerListener marlistener=new MarshallerListener();
            // 不进行转义字符的处理
           /* marshaller.setProperty(CharacterEscapeHandler.class.getName(), new CharacterEscapeHandler() {
            public void escape(char[] ch, int start,int length, boolean isAttVal, Writer writer) throws IOException {
                writer.write(ch, start, length);
            }
            });*/
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    public static String subTag(String xmlStr, String startTag, String endTag, int i)
    {
        int startSub = xmlStr.indexOf(startTag) + i;
        int endSub = xmlStr.indexOf(endTag, startSub);
        String xmlData = xmlStr.substring(startSub, endSub);
        return xmlData;
    }
}
