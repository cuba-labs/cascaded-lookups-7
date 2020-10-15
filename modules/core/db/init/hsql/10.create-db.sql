-- begin CASCADEDLOOKUPS_CITY
create table CASCADEDLOOKUPS_CITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    COUNTRY_ID varchar(36),
    --
    primary key (ID)
)^
-- end CASCADEDLOOKUPS_CITY
-- begin CASCADEDLOOKUPS_COUNTRY
create table CASCADEDLOOKUPS_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CASCADEDLOOKUPS_COUNTRY
-- begin CASCADEDLOOKUPS_ADDRESS
create table CASCADEDLOOKUPS_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CITY_ID varchar(36),
    COUNTRY_ID varchar(36),
    ADDRESS_LINE varchar(255),
    --
    primary key (ID)
)^
-- end CASCADEDLOOKUPS_ADDRESS
