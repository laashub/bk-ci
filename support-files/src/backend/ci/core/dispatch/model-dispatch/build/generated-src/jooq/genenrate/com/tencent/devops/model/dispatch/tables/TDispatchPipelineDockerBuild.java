/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables;


import com.tencent.devops.model.dispatch.DevopsDispatch;
import com.tencent.devops.model.dispatch.Keys;
import com.tencent.devops.model.dispatch.tables.records.TDispatchPipelineDockerBuildRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchPipelineDockerBuild extends TableImpl<TDispatchPipelineDockerBuildRecord> {

    private static final long serialVersionUID = 858230878;

    /**
     * The reference instance of <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD</code>
     */
    public static final TDispatchPipelineDockerBuild T_DISPATCH_PIPELINE_DOCKER_BUILD = new TDispatchPipelineDockerBuild();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TDispatchPipelineDockerBuildRecord> getRecordType() {
        return TDispatchPipelineDockerBuildRecord.class;
    }

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.ID</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.BUILD_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> BUILD_ID = createField("BUILD_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.VM_SEQ_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, Integer> VM_SEQ_ID = createField("VM_SEQ_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.SECRET_KEY</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> SECRET_KEY = createField("SECRET_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.STATUS</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, Integer> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.CREATED_TIME</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.UPDATED_TIME</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.ZONE</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> ZONE = createField("ZONE", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.PROJECT_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(34).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.PIPELINE_ID</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> PIPELINE_ID = createField("PIPELINE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(34).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.DISPATCH_MESSAGE</code>. 当前是对应第三方平台docker的镜像名
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> DISPATCH_MESSAGE = createField("DISPATCH_MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(4096).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "当前是对应第三方平台docker的镜像名");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.STARTUP_MESSAGE</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> STARTUP_MESSAGE = createField("STARTUP_MESSAGE", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD.ROUTE_KEY</code>.
     */
    public final TableField<TDispatchPipelineDockerBuildRecord, String> ROUTE_KEY = createField("ROUTE_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD</code> table reference
     */
    public TDispatchPipelineDockerBuild() {
        this("T_DISPATCH_PIPELINE_DOCKER_BUILD", null);
    }

    /**
     * Create an aliased <code>devops_dispatch.T_DISPATCH_PIPELINE_DOCKER_BUILD</code> table reference
     */
    public TDispatchPipelineDockerBuild(String alias) {
        this(alias, T_DISPATCH_PIPELINE_DOCKER_BUILD);
    }

    private TDispatchPipelineDockerBuild(String alias, Table<TDispatchPipelineDockerBuildRecord> aliased) {
        this(alias, aliased, null);
    }

    private TDispatchPipelineDockerBuild(String alias, Table<TDispatchPipelineDockerBuildRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsDispatch.DEVOPS_DISPATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TDispatchPipelineDockerBuildRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_DISPATCH_PIPELINE_DOCKER_BUILD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TDispatchPipelineDockerBuildRecord> getPrimaryKey() {
        return Keys.KEY_T_DISPATCH_PIPELINE_DOCKER_BUILD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TDispatchPipelineDockerBuildRecord>> getKeys() {
        return Arrays.<UniqueKey<TDispatchPipelineDockerBuildRecord>>asList(Keys.KEY_T_DISPATCH_PIPELINE_DOCKER_BUILD_PRIMARY, Keys.KEY_T_DISPATCH_PIPELINE_DOCKER_BUILD_BUILD_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineDockerBuild as(String alias) {
        return new TDispatchPipelineDockerBuild(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TDispatchPipelineDockerBuild rename(String name) {
        return new TDispatchPipelineDockerBuild(name, null);
    }
}