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
);