/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.hr.model.impl;

import com.liferay.hr.model.HRTimeOffFrequencyType;
import com.liferay.hr.model.HRTimeOffFrequencyTypeModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HRTimeOffFrequencyType service. Represents a row in the &quot;HRTimeOffFrequencyType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRTimeOffFrequencyTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRTimeOffFrequencyTypeImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRTimeOffFrequencyTypeImpl
 * @see com.liferay.hr.model.HRTimeOffFrequencyType
 * @see com.liferay.hr.model.HRTimeOffFrequencyTypeModel
 * @generated
 */
public class HRTimeOffFrequencyTypeModelImpl extends BaseModelImpl<HRTimeOffFrequencyType>
	implements HRTimeOffFrequencyTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r time off frequency type model instance should use the {@link com.liferay.hr.model.HRTimeOffFrequencyType} interface instead.
	 */
	public static final String TABLE_NAME = "HRTimeOffFrequencyType";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrTimeOffFrequencyTypeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "code_", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table HRTimeOffFrequencyType (hrTimeOffFrequencyTypeId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,code_ VARCHAR(75) null,name VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table HRTimeOffFrequencyType";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRTimeOffFrequencyType"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRTimeOffFrequencyType"),
			true);

	public Class<?> getModelClass() {
		return HRTimeOffFrequencyType.class;
	}

	public String getModelClassName() {
		return HRTimeOffFrequencyType.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRTimeOffFrequencyType"));

	public HRTimeOffFrequencyTypeModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrTimeOffFrequencyTypeId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrTimeOffFrequencyTypeId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrTimeOffFrequencyTypeId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrTimeOffFrequencyTypeId() {
		return _hrTimeOffFrequencyTypeId;
	}

	public void setHrTimeOffFrequencyTypeId(long hrTimeOffFrequencyTypeId) {
		_hrTimeOffFrequencyTypeId = hrTimeOffFrequencyTypeId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getCode() {
		if (_code == null) {
			return StringPool.BLANK;
		}
		else {
			return _code;
		}
	}

	public void setCode(String code) {
		if (_originalCode == null) {
			_originalCode = _code;
		}

		_code = code;
	}

	public String getOriginalCode() {
		return GetterUtil.getString(_originalCode);
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public HRTimeOffFrequencyType toEscapedModel() {
		if (isEscapedModel()) {
			return (HRTimeOffFrequencyType)this;
		}
		else {
			return (HRTimeOffFrequencyType)Proxy.newProxyInstance(_classLoader,
				_escapedModelProxyInterfaces, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRTimeOffFrequencyType.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		HRTimeOffFrequencyTypeImpl hrTimeOffFrequencyTypeImpl = new HRTimeOffFrequencyTypeImpl();

		hrTimeOffFrequencyTypeImpl.setHrTimeOffFrequencyTypeId(getHrTimeOffFrequencyTypeId());
		hrTimeOffFrequencyTypeImpl.setGroupId(getGroupId());
		hrTimeOffFrequencyTypeImpl.setCompanyId(getCompanyId());
		hrTimeOffFrequencyTypeImpl.setUserId(getUserId());
		hrTimeOffFrequencyTypeImpl.setUserName(getUserName());
		hrTimeOffFrequencyTypeImpl.setCreateDate(getCreateDate());
		hrTimeOffFrequencyTypeImpl.setModifiedDate(getModifiedDate());
		hrTimeOffFrequencyTypeImpl.setCode(getCode());
		hrTimeOffFrequencyTypeImpl.setName(getName());
		hrTimeOffFrequencyTypeImpl.setDescription(getDescription());

		hrTimeOffFrequencyTypeImpl.resetOriginalValues();

		return hrTimeOffFrequencyTypeImpl;
	}

	public int compareTo(HRTimeOffFrequencyType hrTimeOffFrequencyType) {
		long primaryKey = hrTimeOffFrequencyType.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HRTimeOffFrequencyType hrTimeOffFrequencyType = null;

		try {
			hrTimeOffFrequencyType = (HRTimeOffFrequencyType)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrTimeOffFrequencyType.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public void resetOriginalValues() {
		HRTimeOffFrequencyTypeModelImpl hrTimeOffFrequencyTypeModelImpl = this;

		hrTimeOffFrequencyTypeModelImpl._originalGroupId = hrTimeOffFrequencyTypeModelImpl._groupId;

		hrTimeOffFrequencyTypeModelImpl._setOriginalGroupId = false;

		hrTimeOffFrequencyTypeModelImpl._originalCode = hrTimeOffFrequencyTypeModelImpl._code;
	}

	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{hrTimeOffFrequencyTypeId=");
		sb.append(getHrTimeOffFrequencyTypeId());
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
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRTimeOffFrequencyType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrTimeOffFrequencyTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrTimeOffFrequencyTypeId());
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
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRTimeOffFrequencyType.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRTimeOffFrequencyType.class
		};
	private long _hrTimeOffFrequencyTypeId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _code;
	private String _originalCode;
	private String _name;
	private String _description;
	private transient ExpandoBridge _expandoBridge;
}