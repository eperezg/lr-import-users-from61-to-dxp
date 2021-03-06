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

package com.liferay.suez.user.synch.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.suez.user.synch.model.ExtUser;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the ext user service. This utility wraps {@link com.liferay.suez.user.synch.service.persistence.impl.ExtUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExtUserPersistence
 * @see com.liferay.suez.user.synch.service.persistence.impl.ExtUserPersistenceImpl
 * @generated
 */
@ProviderType
public class ExtUserUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ExtUser extUser) {
		getPersistence().clearCache(extUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExtUser> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExtUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExtUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExtUser> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExtUser update(ExtUser extUser) {
		return getPersistence().update(extUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExtUser update(ExtUser extUser, ServiceContext serviceContext) {
		return getPersistence().update(extUser, serviceContext);
	}

	/**
	* Caches the ext user in the entity cache if it is enabled.
	*
	* @param extUser the ext user
	*/
	public static void cacheResult(ExtUser extUser) {
		getPersistence().cacheResult(extUser);
	}

	/**
	* Caches the ext users in the entity cache if it is enabled.
	*
	* @param extUsers the ext users
	*/
	public static void cacheResult(List<ExtUser> extUsers) {
		getPersistence().cacheResult(extUsers);
	}

	/**
	* Creates a new ext user with the primary key. Does not add the ext user to the database.
	*
	* @param userId the primary key for the new ext user
	* @return the new ext user
	*/
	public static ExtUser create(long userId) {
		return getPersistence().create(userId);
	}

	/**
	* Removes the ext user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the ext user
	* @return the ext user that was removed
	* @throws NoSuchExtUserException if a ext user with the primary key could not be found
	*/
	public static ExtUser remove(long userId)
		throws com.liferay.suez.user.synch.exception.NoSuchExtUserException {
		return getPersistence().remove(userId);
	}

	public static ExtUser updateImpl(ExtUser extUser) {
		return getPersistence().updateImpl(extUser);
	}

	/**
	* Returns the ext user with the primary key or throws a {@link NoSuchExtUserException} if it could not be found.
	*
	* @param userId the primary key of the ext user
	* @return the ext user
	* @throws NoSuchExtUserException if a ext user with the primary key could not be found
	*/
	public static ExtUser findByPrimaryKey(long userId)
		throws com.liferay.suez.user.synch.exception.NoSuchExtUserException {
		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	* Returns the ext user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the ext user
	* @return the ext user, or <code>null</code> if a ext user with the primary key could not be found
	*/
	public static ExtUser fetchByPrimaryKey(long userId) {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	public static java.util.Map<java.io.Serializable, ExtUser> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ext users.
	*
	* @return the ext users
	*/
	public static List<ExtUser> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ext users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext users
	* @param end the upper bound of the range of ext users (not inclusive)
	* @return the range of ext users
	*/
	public static List<ExtUser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ext users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext users
	* @param end the upper bound of the range of ext users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ext users
	*/
	public static List<ExtUser> findAll(int start, int end,
		OrderByComparator<ExtUser> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ext users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ExtUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ext users
	* @param end the upper bound of the range of ext users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ext users
	*/
	public static List<ExtUser> findAll(int start, int end,
		OrderByComparator<ExtUser> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ext users from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ext users.
	*
	* @return the number of ext users
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ExtUserPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ExtUserPersistence, ExtUserPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ExtUserPersistence.class);
}