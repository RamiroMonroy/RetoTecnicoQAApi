package co.com.choucair.certification.testapi.utils.resource;

import co.com.choucair.certification.testapi.utils.constants.EndPoints;

public enum WebServiceEndPointsGet {

    URI(EndPoints.URL_USERS);

        private final String url;
        WebServiceEndPointsGet(String url){
            this.url=url;
        }

        public String getUrl(){
            return url;
        }

}
