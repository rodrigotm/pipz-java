package com.simplesdental.pipz.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company {

	@JsonProperty("address_1")
	public String address1;

	@JsonProperty("address_2")
	public String address2;

	@JsonProperty("city_name")
	public String cityName;

	@JsonProperty("continent_code")
	public String continentCode;

	public Integer count;

	@JsonProperty("country_code")
	public String countryCode;

	@JsonProperty("country_name")
	public String countryName;

	@JsonProperty("creation_date")
	public Date creationDate;

	@JsonProperty("custom_attributes")
	public CustomAtribute customAttributes;

	public String email;

	public String facebook;

	@JsonProperty("ga_campaign")
	public String gaCampaign;

	@JsonProperty("ga_content")
	public String gaContent;

	@JsonProperty("ga_medium")
	public String gaMedium;

	@JsonProperty("ga_source")
	public String gaSource;

	@JsonProperty("ga_term")
	public String gaTerm;

	public Integer id;

	public Integer industry;

	@JsonProperty("interaction_count")
	public Integer interactionCount;

	@JsonProperty("ip_address")
	public String ipAddress;

	@JsonProperty("last_conversion")
	public String lastConversion;

	@JsonProperty("last_conversion_date")
	public Date lastConversionDate;

	@JsonProperty("last_event")
	public String lastEvent;

	@JsonProperty("last_interaction_date")
	public Date lastInteractionDate;

	public String linkedin;

	@JsonProperty("monthly_spend")
	public BigDecimal monthlySpend;

	public String name;

	@JsonProperty("number_of_employees")
	public Integer numberOfEmployees;

	@JsonProperty("origin_detail")
	public String originDetail;

	@JsonProperty("origin_id")
	public String originId;

	public String phone;

	public String plan;

	@JsonProperty("postal_code")
	public String postalCode;

	public String referer;

	@JsonProperty("region_name")
	public String regionName;

	@JsonProperty("remote_creation_date")
	public Date remoteCreationDate;

	@JsonProperty("remote_id")
	public String remoteId;

	@JsonProperty("stage_id")
	public Integer stageId;

	public String state;

	public List<String> tags;

	public String twitter;

	@JsonProperty("update_date")
	public Date updateDate;

	@JsonProperty("updated_by")
	public String updatedBy;

	public String website;
}
