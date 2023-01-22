package co.com.choucair.certification.testapi.utils.resource;

import co.com.choucair.certification.testapi.utils.constants.EndPoints;

public enum WebServiceEndPointsPost {

    URI(EndPoints.URL_POST);

        private final String url;
        WebServiceEndPointsPost(String url){
            this.url=url;
        }

        public String getUrl(){
            return url;
        }

}
