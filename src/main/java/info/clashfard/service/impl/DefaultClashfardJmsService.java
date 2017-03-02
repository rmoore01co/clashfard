/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package info.clashfard.service.impl;

import info.clashfard.service.ClashfardJmsService;
import org.springframework.messaging.Message;

public class DefaultClashfardJmsService implements ClashfardJmsService {
    @Override
    public void print(Message<?> message) {
        System.out.println(String.format("Printing message from service: %s", message.getPayload().toString()));
        System.out.println(String.format("service method headers: %s", message.getHeaders()));
    }
}
