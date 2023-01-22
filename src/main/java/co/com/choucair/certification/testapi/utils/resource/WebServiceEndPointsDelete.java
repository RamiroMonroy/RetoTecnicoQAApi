package co.com.choucair.certification.testapi.utils.resource;

import co.com.choucair.certification.testapi.utils.constants.EndPoints;

public enum WebServiceEndPointsDelete {

    URI(EndPoints.URL_DELETE);

        private final String url;
        WebServiceEndPointsDelete(String url){
            this.url=url;
        }

        public String getUrl(){
            return url;
        }

}
