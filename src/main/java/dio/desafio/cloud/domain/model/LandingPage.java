
package dio.desafio.cloud.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_landingpage")
public class LandingPage extends BaseFields {

    private String logo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MenuItem> menuItem;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> feature;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Testimonial> testimonial;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Gallery> gallery;

    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<MenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public List<Feature> getFeature() {
        return feature;
    }

    public void setFeature(List<Feature> feature) {
        this.feature = feature;
    }

    public List<Testimonial> getTestimonial() {
        return testimonial;
    }

    public void setTestimonial(List<Testimonial> testimonial) {
        this.testimonial = testimonial;
    }

    public List<Gallery> getGallery() {
        return gallery;
    }

    public void setGallery(List<Gallery> gallery) {
        this.gallery = gallery;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
