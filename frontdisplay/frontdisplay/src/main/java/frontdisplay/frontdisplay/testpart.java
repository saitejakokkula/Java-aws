package frontdisplay.frontdisplay;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class testpart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dockerDTO doc = new dockerDTO();
		doc.setDid(4);
		doc.setDname("akshu");
		doc.setDfee(1200);
		doc.setDspec("cardio");
		doc.setDapointment("open");
		doc.setDstudy("MBBS FRC");
		doc.setExp(6);
		
		
		RestTemplate rst = new RestTemplate();
		String url = "http://localhost:8080/dcontroller/save";
//		dockerDTO data = rst.postForObject(url, doc, dockerDTO.class);
//		System.out.println(data);
		
		ResponseEntity<dockerDTO> rata =  rst.postForEntity(url, doc, dockerDTO.class);
		
		System.out.println(rata.getHeaders());
		System.out.println(rata.getBody());
		System.out.println(rata.getStatusCode());

	}

}
