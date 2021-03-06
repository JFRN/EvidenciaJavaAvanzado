package me.jmll.utm.service;

import java.util.List;

import me.jmll.utm.model.Notification;

public interface NotificationService {
	public Notification notify(String subject, String message, List<String> toAddress, List<String> ccAddress);
	
	public List<Notification> getNotifications();
}
