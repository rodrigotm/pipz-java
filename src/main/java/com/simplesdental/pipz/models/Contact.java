package com.simplesdental.pipz.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {

	@JsonProperty("average_order")
	public BigDecimal averageOrder;

	public Date birthdate;

	public Integer bounces;

	@JsonProperty("city_name")
	public String cityName;

	public Integer clicks;

	public List<Company> companies;

	public Company company;

	@JsonProperty("company_id")
	public Integer companyId;

	@JsonProperty("continent_code")
	public String continentCode;

	@JsonProperty("cookie_id")
	public Integer cookieId;

	@JsonProperty("count_order")
	public Integer countOrder;

	@JsonProperty("country_code")
	public String countryCode;

	@JsonProperty("country_name")
	public String countryName;

	@JsonProperty("creation_date")
	public Date creationDate;

	public String currency;

	@JsonProperty("custom_attributes")
	public CustomAtribute customAttributes;

	public String device;

	public String email;

	@JsonProperty("email_status")
	public String emailStatus;

	@JsonProperty("emails_received")
	public Integer emailsReceived;

	@JsonProperty("emails_sent")
	public Integer emailsSent;

	public String facebook;

	@JsonProperty("first_order")
	public Date firstOrder;

	public String gender;

	@JsonProperty("geo_city_name")
	public String geoCityName;

	@JsonProperty("geo_continent_code")
	public String geoContinentCode;

	@JsonProperty("geo_country_code")
	public String geoCountryCode;

	@JsonProperty("geo_country_name")
	public String geoCountryName;

	@JsonProperty("geo_latitude")
	public BigDecimal geoLatitude;

	@JsonProperty("geo_longitude")
	public BigDecimal geoLongitude;

	@JsonProperty("geo_postal_code")
	public String geoPostalCode;

	@JsonProperty("geo_region_name")
	public String geoRegionName;

	@JsonProperty("geo_state")
	public String geoState;

	public Integer id;

	@JsonProperty("interaction_count")
	public Integer interactionCount;

	@JsonProperty("ip_address")
	public String ipAddress;

	@JsonProperty("is_online")
	public boolean isOnline;

	@JsonProperty("job_title")
	public String jobTitle;

	public String language;

	@JsonProperty("last_conversion")
	public String lastConversion;

	@JsonProperty("last_conversion_date")
	public Date lastConversionDate;

	@JsonProperty("last_email_interaction_date")
	public Date lastEmailInteractionDate;

	@JsonProperty("last_event")
	public String lastEvent;

	@JsonProperty("last_event_date")
	public Date lastEventDate;

	@JsonProperty("last_interaction_date")
	public Date lastInteractionDate;

	@JsonProperty("last_order")
	public Date lastOrder;

	@JsonProperty("last_referer")
	public String lastReferer;

	@JsonProperty("last_seen_ip")
	public String lastSeenIp;

	@JsonProperty("last_session_date")
	public Date lastSessionDate;

	@JsonProperty("last_utm_campaign")
	public String lastUtmCampaign;

	@JsonProperty("last_utm_content")
	public String lastUtmContent;

	@JsonProperty("last_utm_medium")
	public String lastUtmMedium;

	@JsonProperty("last_utm_source")
	public String lastUtmSource;

	@JsonProperty("last_utm_term")
	public String lastUtmTerm;

	public BigDecimal latitude;

	public String linkedin;

	public BigDecimal longitude;

	@JsonProperty("milestone_expire_date")
	public Date milestoneExpireDate;

	@JsonProperty("mobile_phone")
	public String mobilePhone;

	public String name;

	@JsonProperty("no_response")
	public BigDecimal noResponse;

	@JsonProperty("nps_date")
	public Date npsDate;

	@JsonProperty("nps_score")
	public BigDecimal npsScore;

	public Integer opens;

	public String optin;

	@JsonProperty("optin_automation")
	public String optinAutomation;

	@JsonProperty("origin_detail")
	public String originDetail;

	@JsonProperty("origin_id")
	public String originId;

	@JsonProperty("os_family")
	public String osFamily;

	@JsonProperty("os_version")
	public String osVersion;

	@JsonProperty("owner_id")
	public Integer ownerId;

	@JsonProperty("page_views")
	public Integer pageViews;

	public String password;

	public String phone;

	@JsonProperty("postal_code")
	public String postalCode;

	public String reader;

	@JsonProperty("reader_type")
	public String readerType;

	public String referer;

	@JsonProperty("region_name")
	public String regionName;

	@JsonProperty("remote_creation_date")
	public Date remoteCreationDate;

	@JsonProperty("remote_id")
	public Integer remoteId;

	public BigDecimal score;

	@JsonProperty("session_count")
	public Integer sessionCount;

	@JsonProperty("sign_up_date")
	public Date signUpDate;

	@JsonProperty("stage_id")
	public Integer stageId;

	public String state;

	public Integer status;

	public List<String> tags;

	@JsonProperty("time_spent")
	public BigDecimal timeSpent;

	public String timezone;

	@JsonProperty("total_order")
	public Integer totalOrder;

	public String twitter;

	@JsonProperty("update_date")
	public Date updateDate;

	@JsonProperty("updated_by")
	public String updatedBy;

	@JsonProperty("utm_campaign")
	public String utmCampaign;

	@JsonProperty("utm_content")
	public String utmContent;

	@JsonProperty("utm_medium")
	public String utmMedium;

	@JsonProperty("utm_source")
	public String utmSource;

	@JsonProperty("utm_term")
	public String utmTerm;

	public String uuid;

	public String website;

	public Event event;
}
