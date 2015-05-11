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

import com.mobilekipyonetim.service.model.Branch;
import com.mobilekipyonetim.service.model.BranchModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Branch service. Represents a row in the &quot;brach&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.mobilekipyonetim.service.model.BranchModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BranchImpl}.
 * </p>
 *
 * @author 002834
 * @see BranchImpl
 * @see com.mobilekipyonetim.service.model.Branch
 * @see com.mobilekipyonetim.service.model.BranchModel
 * @generated
 */
public class BranchModelImpl extends BaseModelImpl<Branch>
	implements BranchModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a branch model instance should use the {@link com.mobilekipyonetim.service.model.Branch} interface instead.
	 */
	public static final String TABLE_NAME = "brach";
	public static final Object[][] TABLE_COLUMNS = {
			{ "entityId", Types.INTEGER },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "lat", Types.INTEGER },
			{ "lng", Types.INTEGER },
			{ "organizationId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table brach (entityId INTEGER not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,lat INTEGER,lng INTEGER,organizationId LONG)";
	public static final String TABLE_SQL_DROP = "drop table brach";
	public static final String ORDER_BY_JPQL = " ORDER BY branch.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY brach.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.mobilekipyonetim.service.model.Branch"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.mobilekipyonetim.service.model.Branch"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.mobilekipyonetim.service.model.Branch"),
			true);
	public static long NAME_COLUMN_BITMASK = 1L;
	public static long ORGANIZATIONID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.mobilekipyonetim.service.model.Branch"));

	public BranchModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _entityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setEntityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Branch.class;
	}

	@Override
	public String getModelClassName() {
		return Branch.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entityId", getEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("lat", getLat());
		attributes.put("lng", getLng());
		attributes.put("organizationId", getOrganizationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer entityId = (Integer)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer lat = (Integer)attributes.get("lat");

		if (lat != null) {
			setLat(lat);
		}

		Integer lng = (Integer)attributes.get("lng");

		if (lng != null) {
			setLng(lng);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}
	}

	@Override
	public int getEntityId() {
		return _entityId;
	}

	@Override
	public void setEntityId(int entityId) {
		_entityId = entityId;
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
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@Override
	public int getLat() {
		return _lat;
	}

	@Override
	public void setLat(int lat) {
		_lat = lat;
	}

	@Override
	public int getLng() {
		return _lng;
	}

	@Override
	public void setLng(int lng) {
		_lng = lng;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Branch toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Branch)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BranchImpl branchImpl = new BranchImpl();

		branchImpl.setEntityId(getEntityId());
		branchImpl.setGroupId(getGroupId());
		branchImpl.setCompanyId(getCompanyId());
		branchImpl.setUserId(getUserId());
		branchImpl.setUserName(getUserName());
		branchImpl.setCreateDate(getCreateDate());
		branchImpl.setModifiedDate(getModifiedDate());
		branchImpl.setName(getName());
		branchImpl.setLat(getLat());
		branchImpl.setLng(getLng());
		branchImpl.setOrganizationId(getOrganizationId());

		branchImpl.resetOriginalValues();

		return branchImpl;
	}

	@Override
	public int compareTo(Branch branch) {
		int value = 0;

		value = getName().compareTo(branch.getName());

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

		if (!(obj instanceof Branch)) {
			return false;
		}

		Branch branch = (Branch)obj;

		int primaryKey = branch.getPrimaryKey();

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
		BranchModelImpl branchModelImpl = this;

		branchModelImpl._originalName = branchModelImpl._name;

		branchModelImpl._originalOrganizationId = branchModelImpl._organizationId;

		branchModelImpl._setOriginalOrganizationId = false;

		branchModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Branch> toCacheModel() {
		BranchCacheModel branchCacheModel = new BranchCacheModel();

		branchCacheModel.entityId = getEntityId();

		branchCacheModel.groupId = getGroupId();

		branchCacheModel.companyId = getCompanyId();

		branchCacheModel.userId = getUserId();

		branchCacheModel.userName = getUserName();

		String userName = branchCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			branchCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			branchCacheModel.createDate = createDate.getTime();
		}
		else {
			branchCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			branchCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			branchCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		branchCacheModel.name = getName();

		String name = branchCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			branchCacheModel.name = null;
		}

		branchCacheModel.lat = getLat();

		branchCacheModel.lng = getLng();

		branchCacheModel.organizationId = getOrganizationId();

		return branchCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{entityId=");
		sb.append(getEntityId());
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
		sb.append(", name=");
		sb.append(getName());
		sb.append(", lat=");
		sb.append(getLat());
		sb.append(", lng=");
		sb.append(getLng());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.mobilekipyonetim.service.model.Branch");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>entityId</column-name><column-value><![CDATA[");
		sb.append(getEntityId());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lat</column-name><column-value><![CDATA[");
		sb.append(getLat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lng</column-name><column-value><![CDATA[");
		sb.append(getLng());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Branch.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Branch.class };
	private int _entityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _originalName;
	private int _lat;
	private int _lng;
	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private long _columnBitmask;
	private Branch _escapedModel;
}