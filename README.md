# shoppinggenerator

A Random shopping generator for testings.

This API generate a random shopping list. This feature works for another microservices and apis for testing or research.

<h1>Feature and stack</h1>

- Api First with OpenApi 3.0.2
- Spring Boot 2.5.5
- Swagger2
- MapStruct
- Spring Actuator

<h1>API Endpoints</h1>

GET /shopping

GET /actuator/mappings

GET /swagger-ui.html


<h1>Response</h1>

```
[
    {
        "id": "50584519-f688-4e44-aebf-61d63ac74f54",
        "person": {
            "id": "e4326596-d2ea-48ad-9f00-ab3850c48dda",
            "firstName": "Eduardo",
            "lastName": "Pérez"
        },
        "products": [
            {
                "id": "026b62a5-f658-4281-9e01-ab5e1f4a129e",
                "title": "P1",
                "price": 60
            },
            {
                "id": "3695bb06-ea34-4fe6-bbd3-9eccb7243575",
                "title": "P9",
                "price": 84
            },
            {
                "id": "9f62913e-0097-4766-a436-b19b485d5503",
                "title": "P1",
                "price": 106
            },
            {
                "id": "cc063244-e8b2-4130-9f32-17a0beb08aff",
                "title": "P9",
                "price": 2
            },
            {
                "id": "68ffee38-65da-459f-a08b-fdb713de038c",
                "title": "P5",
                "price": 91
            },
            {
                "id": "3fb53bc2-7533-49a8-af06-9ee391183e97",
                "title": "P10",
                "price": 16
            },
            {
                "id": "b3e76844-84f1-48c5-84ae-85c1260d3e03",
                "title": "P9",
                "price": 143
            },
            {
                "id": "40965b04-f87b-4411-a78c-e285b937bdd9",
                "title": "P8",
                "price": 137
            },
            {
                "id": "8e68605f-2303-4ad9-9e8b-f41738fb09ed",
                "title": "P8",
                "price": 84
            },
            {
                "id": "87fde67f-88c2-4ee2-bb27-8d3090486d83",
                "title": "P10",
                "price": 15
            }
        ],
        "registerTimestamp": 1633174827440,
        "totalPrice": 738
    }
]


```

