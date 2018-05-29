package com.hortonworks.faas.nfaas.core.helper;

import com.hortonworks.faas.nfaas.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseFacadeHelper {

    private static final Logger logger = LoggerFactory.getLogger(BaseFacadeHelper.class);

    int WAIT_IN_SEC = 10;

    @Autowired
    ControllerService controllerService;

    @Autowired
    ProcessorGroupFlowFacadeHelper processorGroupFlowFacadeHelper;

    @Autowired
    FlowFileQueue flowFileQueues;

    @Autowired
    ProcessGroup processGroup;

    @Autowired
    CommonService commonService;

    @Autowired
    Template template;

    @Autowired
    TemplateFacadeHelper templateFacadeHelper;

    @Autowired
    RemoteProcessGroup remoteProcessGroup;

    @Autowired
    ProcessGroupFlow processGroupFlow;

    @Autowired
    FlowFileQueue flowFileQueue;

    @Autowired
    InputPort inputPort;


}
