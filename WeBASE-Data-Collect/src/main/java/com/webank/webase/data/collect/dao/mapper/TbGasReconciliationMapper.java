package com.webank.webase.data.collect.dao.mapper;

import com.webank.webase.data.collect.dao.entity.TbGasReconciliation;
import com.webank.webase.data.collect.dao.entity.TbGasReconciliationExample;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TbGasReconciliationMapper {

    @Select({ "select", "id, chain_id, group_id, user_address, block_number, trans_hash, ", "reconciliation_status, create_time, modify_time", "from tb_gas_reconciliation", "where chain_id = #{chainId,jdbcType=INTEGER}", "and group_id = #{groupId,jdbcType=INTEGER}", "and user_address = #{userAddress,jdbcType=VARCHAR}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "user_address", property = "userAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "trans_hash", property = "transHash", jdbcType = JdbcType.VARCHAR), @Result(column = "reconciliation_status", property = "reconciliationStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    TbGasReconciliation selectByUser(@Param("chainId") int chainId, @Param("groupId") int groupId, @Param("userAddress") String userAddress);

    @Select({ "select", "id, chain_id, group_id, user_address, block_number, trans_hash, ", "reconciliation_status, create_time, modify_time", "from tb_gas_reconciliation", "where reconciliation_status != 1" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "user_address", property = "userAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "trans_hash", property = "transHash", jdbcType = JdbcType.VARCHAR), @Result(column = "reconciliation_status", property = "reconciliationStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    List<TbGasReconciliation> selectByStatusExceptAbnormal();
    
    @Delete({ "delete from tb_gas_reconciliation", "where chain_id = #{chainId,jdbcType=INTEGER}" })
    int deleteByChainId(@Param("chainId") int chainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbGasReconciliationSqlProvider.class, method = "countByExample")
    long countByExample(TbGasReconciliationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @DeleteProvider(type = TbGasReconciliationSqlProvider.class, method = "deleteByExample")
    int deleteByExample(TbGasReconciliationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @Delete({ "delete from tb_gas_reconciliation", "where id = #{id,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @Insert({ "insert into tb_gas_reconciliation (chain_id, group_id, ", "user_address, block_number, ", "trans_hash, reconciliation_status, ", "create_time, modify_time)", "values (#{chainId,jdbcType=INTEGER}, #{groupId,jdbcType=INTEGER}, ", "#{userAddress,jdbcType=VARCHAR}, #{blockNumber,jdbcType=BIGINT}, ", "#{transHash,jdbcType=VARCHAR}, #{reconciliationStatus,jdbcType=TINYINT}, ", "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(TbGasReconciliation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @InsertProvider(type = TbGasReconciliationSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(TbGasReconciliation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbGasReconciliationSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "user_address", property = "userAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "trans_hash", property = "transHash", jdbcType = JdbcType.VARCHAR), @Result(column = "reconciliation_status", property = "reconciliationStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    List<TbGasReconciliation> selectByExample(TbGasReconciliationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @Select({ "select", "id, chain_id, group_id, user_address, block_number, trans_hash, reconciliation_status, ", "create_time, modify_time", "from tb_gas_reconciliation", "where id = #{id,jdbcType=INTEGER}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "user_address", property = "userAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "trans_hash", property = "transHash", jdbcType = JdbcType.VARCHAR), @Result(column = "reconciliation_status", property = "reconciliationStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    TbGasReconciliation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbGasReconciliationSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbGasReconciliation record, @Param("example") TbGasReconciliationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbGasReconciliationSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") TbGasReconciliation record, @Param("example") TbGasReconciliationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbGasReconciliationSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbGasReconciliation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @Update({ "update tb_gas_reconciliation", "set chain_id = #{chainId,jdbcType=INTEGER},", "group_id = #{groupId,jdbcType=INTEGER},", "user_address = #{userAddress,jdbcType=VARCHAR},", "block_number = #{blockNumber,jdbcType=BIGINT},", "trans_hash = #{transHash,jdbcType=VARCHAR},", "reconciliation_status = #{reconciliationStatus,jdbcType=TINYINT},", "create_time = #{createTime,jdbcType=TIMESTAMP},", "modify_time = #{modifyTime,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKey(TbGasReconciliation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert({ "<script>", "insert into tb_gas_reconciliation (chain_id, ", "group_id, user_address, ", "block_number, trans_hash, ", "reconciliation_status, create_time, ", "modify_time)", "values<foreach collection=\"list\" item=\"detail\" index=\"index\" separator=\",\">(#{detail.chainId,jdbcType=INTEGER}, ", "#{detail.groupId,jdbcType=INTEGER}, #{detail.userAddress,jdbcType=VARCHAR}, ", "#{detail.blockNumber,jdbcType=BIGINT}, #{detail.transHash,jdbcType=VARCHAR}, ", "#{detail.reconciliationStatus,jdbcType=TINYINT}, #{detail.createTime,jdbcType=TIMESTAMP}, ", "#{detail.modifyTime,jdbcType=TIMESTAMP})</foreach></script>" })
    int batchInsert(List<TbGasReconciliation> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_gas_reconciliation
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbGasReconciliationSqlProvider.class, method = "getOneByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "user_address", property = "userAddress", jdbcType = JdbcType.VARCHAR), @Result(column = "block_number", property = "blockNumber", jdbcType = JdbcType.BIGINT), @Result(column = "trans_hash", property = "transHash", jdbcType = JdbcType.VARCHAR), @Result(column = "reconciliation_status", property = "reconciliationStatus", jdbcType = JdbcType.TINYINT), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP) })
    Optional<TbGasReconciliation> getOneByExample(TbGasReconciliationExample example);
}
