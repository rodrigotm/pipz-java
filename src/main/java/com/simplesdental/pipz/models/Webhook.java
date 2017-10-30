package com.simplesdental.pipz.models;

import java.util.Date;
import java.util.List;

import com.simplesdental.pipz.models.enums.StatusWebhook;

public class Webhook {
	public Long id;
	public String url;
	public String contentType;
	public String secret;
	public List<String> events;
	public StatusWebhook status;
	public Date createdOn;
	public Date modifiedOn;
}
