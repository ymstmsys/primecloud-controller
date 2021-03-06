package jp.primecloud.auto.api.response.image;

import java.util.ArrayList;
import java.util.List;

import jp.primecloud.auto.entity.crud.Image;
import jp.primecloud.auto.entity.crud.Platform;

import org.codehaus.jackson.annotate.JsonProperty;

public class ImageResponse {

    @JsonProperty("ImageNo")
    private Long imageNo;

    @JsonProperty("ImageName")
    private String imageName;

    @JsonProperty("PlatformNo")
    private Long platformNo;

    @JsonProperty("PlatformName")
    private String platformName;

    @JsonProperty("OS")
    private String os;

    @JsonProperty("InstanceTypes")
    private List<String> instanceTypes = new ArrayList<String>();

    public ImageResponse(Platform platform, Image image) {
        this.imageNo = image.getImageNo();
        this.imageName = image.getImageNameDisp();
        this.platformNo = platform.getPlatformNo();
        this.platformName = platform.getPlatformNameDisp();
        this.os = image.getOsDisp();
    }

    public Long getImageNo() {
        return imageNo;
    }

    public void setImageNo(Long imageNo) {
        this.imageNo = imageNo;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(Long platformNo) {
        this.platformNo = platformNo;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public List<String> getInstanceTypes() {
        return instanceTypes;
    }

    public void setInstanceTypes(List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

}
