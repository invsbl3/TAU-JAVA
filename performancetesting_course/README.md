## Tools and Techniques for Performance and Load Testing

## Chapter One
Basic Concepts
- Performance: speed of an action on a single client
- Load: number of requests a service can handle in a period

### Client Performance
- Network conditions
- Resources needed (number and size)
- Script Execution
- Image Rendering (most visible aspect)
- Server Performance (API calls interfere in load time perception)

### Server Performance
- Host Configuration
- Data Access
- Third party services
- Compute requirements (compute in client side vs server)
- Client Load

## Chapter Two
Testing on Client

### WebTools
- When the page is visible?
- When it is usable?
- How are resources handled?
- How scripts are running (how many, their complexity, their work flow...)

- ChromeDevTools

## Chapter Three
### Mobile Testing
- Page Speed Insights
- Android Studio

## Chapter Four
Load testing Tools
- JMeter (Groovy)
- Gatling (Scala)

## Chapter Five
Load Testing Strategy
- One service or various micro-services?
- Third-party dependencies? Databases? Hosting? Redirects?

### What to test
- Most used API's
- Heaviest API's
- Most Critical API's

### What to Look For
- Slow API's (>250ms)
- Duplicated Calls
- Call Frequency
- Calls in correct order

### Monitoring
To really understand how the features are used in a live project

### Test Types
- Session Based (similar to feature-session in cucumber)
- Stress (push services to limit)
- Soak tests (run for long time)
- Benchmark (quick tests in pipeline)

## Calculating Load
- Peak hour have 20% of daily traffic


## Interpreting Results
- be aware of coordinated omission

- test early and often
- find performance limits
- guarantee that the client adapts to various network contexts


## Certificate of Completion
[here](https://testautomationu.applitools.com/certificate/?id=6dc9ebb0)