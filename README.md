# RESTful API com Deploy na Nuvem

## Domínio: LandingPage

API para registro e recuperação de informações para compor LandingPages

## Principais Tecnologias
 - Java 17
 - Spring Boot 3
 - Spring Data JPA
 - OpenAPI (Swagger)
 - Railway

## Diagrama de Classes

```mermaid
classDiagram
  class LandingPage {
    -String name
    -String description
    -String logo
    -String image
    -MenuItem[] menu_item
    -Feature[] feature
    -Testimonial[] testimonial
    -Gallery[] gallery
    -Contact contact
  }


  class MenuItem {
    -String icon
    -String description
    -String link
  }


  class Feature {
    -String name
    -String description
    -String image
  }


  class Testimonial {
    -String name
    -String image
    -String description
  }


  class Gallery {
    -String name
    -String image
    -String description
  }


  class Contact {
    -String phone
    -String email
    -String address
  }

  LandingPage "1" *-- "N" MenuItem
  LandingPage "1" *-- "N" Feature
  LandingPage "1" *-- "N" Testimonial
  LandingPage "1" *-- "N" Gallery
  LandingPage "1" *-- "1" Contact
```
