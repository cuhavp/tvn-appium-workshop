var webdriverio = require('webdriverio');
var expect = require('chai').expect;
const wd = require('wd');
var config = require('./helpers/desiredCapabilities').options;
var client = webdriverio.remote(config);
const APPIUM  = "http://localhost:4723/wd/hub";
const IOS_CAPS = {
    platformName: 'ios',
    platformVersion: '12.0',
    deviceName: 'iPhone X',
    automationName: 'XCUITEST',
    bundleId: 'com.apple.mobileslideshow',
    customFindModules: {"ai": "test-ai-classifier"},
    shouldUseCompactResponses: false,
};
describe('Finding element with machine learning', function() {
    let driver;
   before(function(){
    
       driver = wd.promiseChainRemote(APPIUM);
       driver.init(IOS_CAPS);
       this.timeout(20000);
   });


   it('test 1', function(){
    driver.elementByCustom('ai:search').click();
   });
});