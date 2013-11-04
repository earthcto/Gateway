/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.user.credit.Certificate;
import com.creditcloud.model.user.credit.CertificateRecord;
import com.creditcloud.model.user.credit.Proof;
import com.creditcloud.model.user.credit.UserCredit;
import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.enums.user.credit.ProofContentType;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserCreditService {

    /**
     * get UserCredit by userId
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public UserCredit getUserCreditByUserId(String clientCode, String userId);

    /**
     * get user certificate by userId and certificate type
     *
     * @param clientCode
     * @param userId
     * @param type
     * @return
     */
    public Certificate getCertificateByUserByType(String clientCode, String userId, CertificateType type);

    /**
     * get Certificate by its id
     *
     * @param clientCode
     * @param certificateId
     * @return
     */
    public Certificate getCertificateById(String clientCode, String certificateId);

    /**
     * add Proof for user
     *
     * @param clientCode
     * @param userId
     * @param proof
     * @return
     */
    public boolean addProof(String clientCode, String userId, Proof proof);

    /**
     * delete proof by id
     *
     * @param clientCode
     * @param proofId
     * @return
     */
    public boolean deleteProof(String clientCode, String proofId);

    /**
     * get proof by user and content
     *
     * @param clientCode
     * @param userId
     * @param contentType
     * @param content
     * @return
     */
    public Proof getProofByUserAndContent(String clientCode, String userId, ProofContentType contentType, String content);

    /**
     * delete proof by user and content
     *
     * @param clientCode
     * @param userId
     * @param contentType
     * @param content
     * @return
     */
    public boolean deleteProofByUserAndContent(String clientCode, String userId, ProofContentType contentType, String content);

    /**
     * list proof by certificate type and user id
     *
     * @param clientCode
     * @param userId
     * @param type
     * @return
     */
    public List<Proof> listProofByUserAndType(String clientCode, String userId, CertificateType... type);

    /**
     * 列出用户关于某贷款请求的proof
     *
     * @param clientCode
     * @param userId
     * @param requestId
     * @return
     */
    public List<Proof> listProofByLoanRequest(String clientCode, String userId, String requestId);

    /**
     * list all certificate for a user
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public List<Certificate> listCertificateByUser(String clientCode, String userId);

    /**
     * list all certificate records for a certificate
     *
     * @param clientCode
     * @param certificateId
     * @return
     */
    public List<CertificateRecord> listRecordByCertificate(String clientCode, String certificateId);

    /**
     * 更新认证，而且所有的更新记录都被保存下来
     *
     * @param clientCode
     * @param certificate
     * @param auditor
     * @param auditorInfo
     */
    public boolean updateCertificate(String clientCode, Certificate certificate);

    /**
     * 更新信用信息
     *
     * @param clientCode
     * @param credit
     * @return
     */
    public boolean updateUserCredit(String clientCode, UserCredit credit);
}
