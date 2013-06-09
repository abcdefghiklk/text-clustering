//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.10 at 03:15:13 AM ICT 
//


package generated;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import yahoo.answers.Question;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:yahoo:answers}Question" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "question"
})
@XmlRootElement(name = "results")
public class Results {

    @XmlElement(name = "Question", namespace = "urn:yahoo:answers", required = true)
    protected List<Question> question;

    /**
     * Gets the value of the question property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the question property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Question }
     * 
     * 
     */
    public List<Question> getQuestion() {
        if (question == null) {
            question = new ArrayList<Question>();
        }
        return this.question;
    }
    
    public void write(String fileName) {
    	
		try {
			BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(fileName));
			int count = 0;
						
			for (Question q : question) {
				count++;
				bufferWriter.write(Integer.toString(count) + "\n");
				bufferWriter.write(q.getCategory().getContent() + "\n");
				bufferWriter.write(q.getSubject() + "\n");				
				bufferWriter.write(q.getContent() + "\n");
				bufferWriter.write(q.getChosenAnswer() + "\n");
				bufferWriter.write("==================================================\n");
			}
			
			bufferWriter.flush();
			bufferWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
    }

}
