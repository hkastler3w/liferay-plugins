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

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentModel;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the KaleoTaskAssignment service. Represents a row in the &quot;KaleoTaskAssignment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoTaskAssignmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskAssignmentImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentModel
 * @generated
 */
public class KaleoTaskAssignmentModelImpl extends BaseModelImpl<KaleoTaskAssignment>
	implements KaleoTaskAssignmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo task assignment model instance should use the {@link com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoTaskAssignment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoTaskAssignmentId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoDefinitionId", Types.BIGINT },
			{ "kaleoNodeId", Types.BIGINT },
			{ "kaleoTaskId", Types.BIGINT },
			{ "assigneeClassName", Types.VARCHAR },
			{ "assigneeClassPK", Types.BIGINT },
			{ "assigneeActionId", Types.VARCHAR },
			{ "assigneeScript", Types.CLOB },
			{ "assigneeScriptLanguage", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table KaleoTaskAssignment (kaleoTaskAssignmentId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoDefinitionId LONG,kaleoNodeId LONG,kaleoTaskId LONG,assigneeClassName VARCHAR(200) null,assigneeClassPK LONG,assigneeActionId VARCHAR(75) null,assigneeScript TEXT null,assigneeScriptLanguage VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table KaleoTaskAssignment";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoTaskAssignment.kaleoTaskAssignmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoTaskAssignment.kaleoTaskAssignmentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment"),
			true);

	public Class<?> getModelClass() {
		return KaleoTaskAssignment.class;
	}

	public String getModelClassName() {
		return KaleoTaskAssignment.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment"));

	public KaleoTaskAssignmentModelImpl() {
	}

	public long getPrimaryKey() {
		return _kaleoTaskAssignmentId;
	}

	public void setPrimaryKey(long primaryKey) {
		setKaleoTaskAssignmentId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_kaleoTaskAssignmentId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getKaleoTaskAssignmentId() {
		return _kaleoTaskAssignmentId;
	}

	public void setKaleoTaskAssignmentId(long kaleoTaskAssignmentId) {
		_kaleoTaskAssignmentId = kaleoTaskAssignmentId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
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

	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getKaleoNodeId() {
		return _kaleoNodeId;
	}

	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoNodeId = kaleoNodeId;
	}

	public long getKaleoTaskId() {
		return _kaleoTaskId;
	}

	public void setKaleoTaskId(long kaleoTaskId) {
		_kaleoTaskId = kaleoTaskId;
	}

	public String getAssigneeClassName() {
		if (_assigneeClassName == null) {
			return StringPool.BLANK;
		}
		else {
			return _assigneeClassName;
		}
	}

	public void setAssigneeClassName(String assigneeClassName) {
		_assigneeClassName = assigneeClassName;
	}

	public long getAssigneeClassPK() {
		return _assigneeClassPK;
	}

	public void setAssigneeClassPK(long assigneeClassPK) {
		_assigneeClassPK = assigneeClassPK;
	}

	public String getAssigneeActionId() {
		if (_assigneeActionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _assigneeActionId;
		}
	}

	public void setAssigneeActionId(String assigneeActionId) {
		_assigneeActionId = assigneeActionId;
	}

	public String getAssigneeScript() {
		if (_assigneeScript == null) {
			return StringPool.BLANK;
		}
		else {
			return _assigneeScript;
		}
	}

	public void setAssigneeScript(String assigneeScript) {
		_assigneeScript = assigneeScript;
	}

	public String getAssigneeScriptLanguage() {
		if (_assigneeScriptLanguage == null) {
			return StringPool.BLANK;
		}
		else {
			return _assigneeScriptLanguage;
		}
	}

	public void setAssigneeScriptLanguage(String assigneeScriptLanguage) {
		_assigneeScriptLanguage = assigneeScriptLanguage;
	}

	public KaleoTaskAssignment toEscapedModel() {
		if (isEscapedModel()) {
			return (KaleoTaskAssignment)this;
		}
		else {
			return (KaleoTaskAssignment)Proxy.newProxyInstance(_classLoader,
				_escapedModelProxyInterfaces, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					KaleoTaskAssignment.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		KaleoTaskAssignmentImpl kaleoTaskAssignmentImpl = new KaleoTaskAssignmentImpl();

		kaleoTaskAssignmentImpl.setKaleoTaskAssignmentId(getKaleoTaskAssignmentId());
		kaleoTaskAssignmentImpl.setGroupId(getGroupId());
		kaleoTaskAssignmentImpl.setCompanyId(getCompanyId());
		kaleoTaskAssignmentImpl.setUserId(getUserId());
		kaleoTaskAssignmentImpl.setUserName(getUserName());
		kaleoTaskAssignmentImpl.setCreateDate(getCreateDate());
		kaleoTaskAssignmentImpl.setModifiedDate(getModifiedDate());
		kaleoTaskAssignmentImpl.setKaleoDefinitionId(getKaleoDefinitionId());
		kaleoTaskAssignmentImpl.setKaleoNodeId(getKaleoNodeId());
		kaleoTaskAssignmentImpl.setKaleoTaskId(getKaleoTaskId());
		kaleoTaskAssignmentImpl.setAssigneeClassName(getAssigneeClassName());
		kaleoTaskAssignmentImpl.setAssigneeClassPK(getAssigneeClassPK());
		kaleoTaskAssignmentImpl.setAssigneeActionId(getAssigneeActionId());
		kaleoTaskAssignmentImpl.setAssigneeScript(getAssigneeScript());
		kaleoTaskAssignmentImpl.setAssigneeScriptLanguage(getAssigneeScriptLanguage());

		kaleoTaskAssignmentImpl.resetOriginalValues();

		return kaleoTaskAssignmentImpl;
	}

	public int compareTo(KaleoTaskAssignment kaleoTaskAssignment) {
		int value = 0;

		if (getKaleoTaskAssignmentId() < kaleoTaskAssignment.getKaleoTaskAssignmentId()) {
			value = -1;
		}
		else if (getKaleoTaskAssignmentId() > kaleoTaskAssignment.getKaleoTaskAssignmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		KaleoTaskAssignment kaleoTaskAssignment = null;

		try {
			kaleoTaskAssignment = (KaleoTaskAssignment)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = kaleoTaskAssignment.getPrimaryKey();

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
	}

	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{kaleoTaskAssignmentId=");
		sb.append(getKaleoTaskAssignmentId());
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
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoNodeId=");
		sb.append(getKaleoNodeId());
		sb.append(", kaleoTaskId=");
		sb.append(getKaleoTaskId());
		sb.append(", assigneeClassName=");
		sb.append(getAssigneeClassName());
		sb.append(", assigneeClassPK=");
		sb.append(getAssigneeClassPK());
		sb.append(", assigneeActionId=");
		sb.append(getAssigneeActionId());
		sb.append(", assigneeScript=");
		sb.append(getAssigneeScript());
		sb.append(", assigneeScriptLanguage=");
		sb.append(getAssigneeScriptLanguage());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoTaskAssignmentId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTaskAssignmentId());
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
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoTaskId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeClassName</column-name><column-value><![CDATA[");
		sb.append(getAssigneeClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeClassPK</column-name><column-value><![CDATA[");
		sb.append(getAssigneeClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeActionId</column-name><column-value><![CDATA[");
		sb.append(getAssigneeActionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeScript</column-name><column-value><![CDATA[");
		sb.append(getAssigneeScript());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeScriptLanguage</column-name><column-value><![CDATA[");
		sb.append(getAssigneeScriptLanguage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = KaleoTaskAssignment.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			KaleoTaskAssignment.class
		};
	private long _kaleoTaskAssignmentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _kaleoDefinitionId;
	private long _kaleoNodeId;
	private long _kaleoTaskId;
	private String _assigneeClassName;
	private long _assigneeClassPK;
	private String _assigneeActionId;
	private String _assigneeScript;
	private String _assigneeScriptLanguage;
	private transient ExpandoBridge _expandoBridge;
}