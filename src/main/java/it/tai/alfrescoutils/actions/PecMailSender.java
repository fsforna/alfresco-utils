/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tai.alfrescoutils.actions;

import java.util.List;
import org.alfresco.repo.action.executer.ActionExecuterAbstractBase;
import org.alfresco.repo.action.executer.MailActionExecuter;
import org.alfresco.service.cmr.action.Action;
import org.alfresco.service.cmr.action.ParameterDefinition;
import org.alfresco.service.cmr.repository.NodeRef;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Pec Mail Sender action.
 *
 * Please note that the form field must be a valid PEC address otherwise the PEC
 * server will reject the mail.
 *
 * @author Francesco Fornasari T.A.I Software Solution s.r.l
 */
public class PecMailSender extends ActionExecuterAbstractBase {

    private static final Log LOG = LogFactory.getLog(PecMailSender.class);

    private MailActionExecuter mailPec;

    @Override
    protected void executeImpl(Action action, NodeRef actionedUponNodeRef) {

        if (LOG.isDebugEnabled()) {
            LOG.debug("Sending PEC mail");
        }

        mailPec.execute(action, actionedUponNodeRef);

    }

    @Override
    protected void addParameterDefinitions(List<ParameterDefinition> paramList) {

    }

    /**
     * @param mailPec the mailPec to set
     */
    public void setMailPec(org.alfresco.repo.action.executer.MailActionExecuter mailPec) {
        this.mailPec = mailPec;
    }

}
