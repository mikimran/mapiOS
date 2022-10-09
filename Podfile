# Uncomment the next line to define a global platform for your project
platform :ios, '12.3'

def pods_alamofire
    pod 'Alamofire', '4.8.2'
    pod 'AlamofireNetworkActivityLogger', '2.4.0'
end

def pods_firebase
  pod 'Firebase/Core', '8.8.0'
  pod 'Firebase/Messaging', '8.8.0'
  pod 'Firebase/Analytics', '8.8.0'
  pod 'Firebase/Performance', '8.8.0'
  pod 'FirebaseAuth', '8.8.0'
  pod 'Firebase/Crashlytics', '8.8.0'
end

def pods_swiftLint
  pod 'SwiftLint', binary: true
end

target 'MapWithAnnotations' do
  # Comment the next line if you don't want to use dynamic frameworks
  use_frameworks!

  # Pods for MapWithAnnotations

  target 'MapWithAnnotationsTests' do
    inherit! :search_paths

   pods_alamofire
   pods_firebase
   pods_swiftLint

    # Pods for testing
  end

  target 'MapWithAnnotationsUITests' do
    # Pods for testing
  end

end
