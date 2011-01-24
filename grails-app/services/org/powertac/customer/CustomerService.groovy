/*
 * Copyright 2009-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an
 * "AS IS" BASIS,  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.powertac.customer

import org.powertac.common.interfaces.Customer
import org.powertac.common.command.TariffDoReplyCmd
import org.powertac.common.command.TariffDoPublishCmd
import org.powertac.common.Weather
import org.powertac.common.MeterReading

class CustomerService implements Customer {

  static transactional = true


  List<TariffDoReplyCmd> processTariffList(List<TariffDoPublishCmd> tariffDoPublishCmdList) {
    log.info "processTariffList ${tariffDoPublishCmdList}"
    return []
  }

  void processWeatherForecasts(List<Weather> weatherList) {
    log.info "processWeatherForecasts ${weatherList}"
  }

  MeterReading generateMeterReading(Weather weather) {
    log.info "generateMeterReading ${weather}"
    return new MeterReading()
  }

  Customer generateCustomerInfo() {
    log.info "generateCustomerInfo"
    return new org.powertac.common.Customer()
  }
}
