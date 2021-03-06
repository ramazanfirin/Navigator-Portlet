/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.mobilekipyonetim.service.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.mobilekipyonetim.service.model.Vehicle;
import com.mobilekipyonetim.service.model.VehicleModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Vehicle service. Represents a row in the &quot;Vehicle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.mobilekipyonetim.service.model.VehicleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VehicleImpl}.
 * </p>
 *
 * @author 002834
 * @see VehicleImpl
 * @see com.mobilekipyonetim.service.model.Vehicle
 * @see com.mobilekipyonetim.service.model.VehicleModel
 * @generated
 */
public class VehicleModelImpl extends BaseModelImpl<Vehicle>
	implements VehicleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vehicle model instance should use the {@link com.mobilekipyonetim.service.model.Vehicle} interface instead.
	 */
	public static final String TABLE_NAME = "Vehicle";
	public static final Object[][] TABLE_COLUMNS = {
			{ "vehicleEntityId", Types.INTEGER },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "plate", Types.VARCHAR },
			{ "organizationId", Types.BIGINT },
			{ "deviceId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table Vehicle (vehicleEntityId INTEGER not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,plate VARCHAR(75) null,organizationId LONG,deviceId LONG)";
	public static final String TABLE_SQL_DROP = "drop table Vehicle";
	public static final String ORDER_BY_JPQL = " ORDER BY vehicle.plate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Vehicle.plate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.mobilekipyonetim.service.model.Vehicle"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.mobilekipyonetim.service.model.Vehicle"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.mobilekipyonetim.service.model.Vehicle"),
			true);
	public static long ORGANIZATIONID_COLUMN_BITMASK = 1L;
	public static long PLATE_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.mobilekipyonetim.service.model.Vehicle"));

	public VehicleModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _vehicleEntityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setVehicleEntityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vehicleEntityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Vehicle.class;
	}

	@Override
	public String getModelClassName() {
		return Vehicle.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vehicleEntityId", getVehicleEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("plate", getPlate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("deviceId", getDeviceId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer vehicleEntityId = (Integer)attributes.get("vehicleEntityId");

		if (vehicleEntityId != null) {
			setVehicleEntityId(vehicleEntityId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String plate = (String)attributes.get("plate");

		if (plate != null) {
			setPlate(plate);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}
	}

	@Override
	public int getVehicleEntityId() {
		return _vehicleEntityId;
	}

	@Override
	public void setVehicleEntityId(int vehicleEntityId) {
		_vehicleEntityId = vehicleEntityId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getPlate() {
		if (_plate == null) {
			return StringPool.BLANK;
		}
		else {
			return _plate;
		}
	}

	@Override
	public void setPlate(String plate) {
		_columnBitmask = -1L;

		if (_originalPlate == null) {
			_originalPlate = _plate;
		}

		_plate = plate;
	}

	public String getOriginalPlate() {
		return GetterUtil.getString(_originalPlate);
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_columnBitmask |= ORGANIZATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganizationId) {
			_setOriginalOrganizationId = true;

			_originalOrganizationId = _organizationId;
		}

		_organizationId = organizationId;
	}

	public long getOriginalOrganizationId() {
		return _originalOrganizationId;
	}

	@Override
	public long getDeviceId() {
		return _deviceId;
	}

	@Override
	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Vehicle toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Vehicle)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VehicleImpl vehicleImpl = new VehicleImpl();

		vehicleImpl.setVehicleEntityId(getVehicleEntityId());
		vehicleImpl.setGroupId(getGroupId());
		vehicleImpl.setCompanyId(getCompanyId());
		vehicleImpl.setUserId(getUserId());
		vehicleImpl.setUserName(getUserName());
		vehicleImpl.setCreateDate(getCreateDate());
		vehicleImpl.setModifiedDate(getModifiedDate());
		vehicleImpl.setPlate(getPlate());
		vehicleImpl.setOrganizationId(getOrganizationId());
		vehicleImpl.setDeviceId(getDeviceId());

		vehicleImpl.resetOriginalValues();

		return vehicleImpl;
	}

	@Override
	public int compareTo(Vehicle vehicle) {
		int value = 0;

		value = getPlate().compareTo(vehicle.getPlate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Vehicle)) {
			return false;
		}

		Vehicle vehicle = (Vehicle)obj;

		int primaryKey = vehicle.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		VehicleModelImpl vehicleModelImpl = this;

		vehicleModelImpl._originalPlate = vehicleModelImpl._plate;

		vehicleModelImpl._originalOrganizationId = vehicleModelImpl._organizationId;

		vehicleModelImpl._setOriginalOrganizationId = false;

		vehicleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Vehicle> toCacheModel() {
		VehicleCacheModel vehicleCacheModel = new VehicleCacheModel();

		vehicleCacheModel.vehicleEntityId = getVehicleEntityId();

		vehicleCacheModel.groupId = getGroupId();

		vehicleCacheModel.companyId = getCompanyId();

		vehicleCacheModel.userId = getUserId();

		vehicleCacheModel.userName = getUserName();

		String userName = vehicleCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			vehicleCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			vehicleCacheModel.createDate = createDate.getTime();
		}
		else {
			vehicleCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vehicleCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vehicleCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		vehicleCacheModel.plate = getPlate();

		String plate = vehicleCacheModel.plate;

		if ((plate != null) && (plate.length() == 0)) {
			vehicleCacheModel.plate = null;
		}

		vehicleCacheModel.organizationId = getOrganizationId();

		vehicleCacheModel.deviceId = getDeviceId();

		return vehicleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{vehicleEntityId=");
		sb.append(getVehicleEntityId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", plate=");
		sb.append(getPlate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", deviceId=");
		sb.append(getDeviceId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.mobilekipyonetim.service.model.Vehicle");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>vehicleEntityId</column-name><column-value><![CDATA[");
		sb.append(getVehicleEntityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plate</column-name><column-value><![CDATA[");
		sb.append(getPlate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deviceId</column-name><column-value><![CDATA[");
		sb.append(getDeviceId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Vehicle.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Vehicle.class
		};
	private int _vehicleEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _plate;
	private String _originalPlate;
	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private long _deviceId;
	private long _columnBitmask;
	private Vehicle _escapedModel;
}