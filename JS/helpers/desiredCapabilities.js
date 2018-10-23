exports.options = {
    desiredCapabilities: {
        platformName: 'ios',
        deviceName: 'iPhone X',
        automationName: 'XCUITEST',
        bundleId: 'com.apple.mobileslideshow',
        customFindModules: {ai: 'test-ai-classifier'},
        shouldUseCompactResponse: false
        
    },
    host: 'localhost',
    port: 4723
};