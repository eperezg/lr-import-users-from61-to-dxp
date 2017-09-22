# lr-import-users-from61-to-dxp
This is a sample project used to import users from liferay 6.1 portal to a dxp one.
It provides to serviceBuilders modules:
- suez-user-import used to retrieve datas from external 6.1 mysql database
- suez-manage-users used to insert data in the dxp database
There is a suez-synch-users module that put togheter the all reading through suez-user-import module and writing using suez-manage-users module 

