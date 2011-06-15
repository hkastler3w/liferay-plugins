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

import com.liferay.hr.model.HRExpenseAccount;
import com.liferay.hr.model.HRExpenseAccountModel;

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
 * The base model implementation for the HRExpenseAccount service. Represents a row in the &quot;HRExpenseAccount&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRExpenseAccountModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRExpenseAccountImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRExpenseAccountImpl
 * @see com.liferay.hr.model.HRExpenseAccount
 * @see com.liferay.hr.model.HRExpenseAccountModel
 * @generated
 */
public class HRExpenseAccountModelImpl extends BaseModelImpl<HRExpenseAccount>
	implements HRExpenseAccountModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r expense account model instance should use the {@link com.liferay.hr.model.HRExpenseAccount} interface instead.
	 */
	public static final String TABLE_NAME = "HRExpenseAccount";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrExpenseAccountId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table HRExpenseAccount (hrExpenseAccountId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,description STRING null)";
	public static final String TABLE_SQL_DROP = "drop table HRExpenseAccount";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRExpenseAccount"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRExpenseAccount"),
			true);

	public Class<?> getModelClass() {
		return HRExpenseAccount.class;
	}

	public String getModelClassName() {
		return HRExpenseAccount.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRExpenseAccount"));

	public HRExpenseAccountModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrExpenseAccountId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrExpenseAccountId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrExpenseAccountId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrExpenseAccountId() {
		return _hrExpenseAccountId;
	}

	public void setHrExpenseAccountId(long hrExpenseAccountId) {
		_hrExpenseAccountId = hrExpenseAccountId;
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

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
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

	public HRExpenseAccount toEscapedModel() {
		if (isEscapedModel()) {
			return (HRExpenseAccount)this;
		}
		else {
			return (HRExpenseAccount)Proxy.newProxyInstance(_classLoader,
				_escapedModelProxyInterfaces, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRExpenseAccount.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		HRExpenseAccountImpl hrExpenseAccountImpl = new HRExpenseAccountImpl();

		hrExpenseAccountImpl.setHrExpenseAccountId(getHrExpenseAccountId());
		hrExpenseAccountImpl.setGroupId(getGroupId());
		hrExpenseAccountImpl.setCompanyId(getCompanyId());
		hrExpenseAccountImpl.setUserId(getUserId());
		hrExpenseAccountImpl.setUserName(getUserName());
		hrExpenseAccountImpl.setCreateDate(getCreateDate());
		hrExpenseAccountImpl.setModifiedDate(getModifiedDate());
		hrExpenseAccountImpl.setName(getName());
		hrExpenseAccountImpl.setDescription(getDescription());

		hrExpenseAccountImpl.resetOriginalValues();

		return hrExpenseAccountImpl;
	}

	public int compareTo(HRExpenseAccount hrExpenseAccount) {
		long primaryKey = hrExpenseAccount.getPrimaryKey();

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

		HRExpenseAccount hrExpenseAccount = null;

		try {
			hrExpenseAccount = (HRExpenseAccount)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrExpenseAccount.getPrimaryKey();

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
		HRExpenseAccountModelImpl hrExpenseAccountModelImpl = this;

		hrExpenseAccountModelImpl._originalGroupId = hrExpenseAccountModelImpl._groupId;

		hrExpenseAccountModelImpl._setOriginalGroupId = false;

		hrExpenseAccountModelImpl._originalName = hrExpenseAccountModelImpl._name;
	}

	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{hrExpenseAccountId=");
		sb.append(getHrExpenseAccountId());
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
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRExpenseAccount");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrExpenseAccountId</column-name><column-value><![CDATA[");
		sb.append(getHrExpenseAccountId());
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
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRExpenseAccount.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRExpenseAccount.class
		};
	private long _hrExpenseAccountId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _originalName;
	private String _description;
	private transient ExpandoBridge _expandoBridge;
}