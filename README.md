# homestay
Backend Application for Homestay App

DB Script to run in mysql database :
CREATE SCHEMA `hs_app_db` ;

Owner create :
URL : http://localhost:8080/api/v1/owner (POST Request)

{
    "name":"Anindya Debnath",
    "contactNo":7878898978,
    "homestays":[
        {
            "homeStayName":"AD-HS",
            "phoneNumber":8989898989,
            "location":{
                "city":"Darjeeling",
                "roadName":"MallRoad",
                "buildingNo":"9/A OS Street",
                "pinCode":"700545"
            }
        }
    ]
}


