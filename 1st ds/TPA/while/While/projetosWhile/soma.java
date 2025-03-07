return (
    <ScrollView contentContainerStyle={styles.container}>
      <View style={styles.header}>
        <Text style={styles.title}>Alan Turing: Pai da Ciência da Computação</Text>
        <Image
          source={{ uri: 'https://upload.wikimedia.org/wikipedia/commons/a/a1/Alan_Turing_Aged_16.jpg' }}
          style={styles.image}
        />
      </View>

      <View style={styles.section}>
        <Text style={styles.subtitle}>Nascimento e Educação</Text>
        <Text style={styles.text}>
          Alan Mathison Turing nasceu em 23 de junho de 1912 em Londres, Inglaterra.
          Desde jovem demonstrou grande aptidão para matemática e ciências.
        </Text>
      </View>

      <View style={styles.section}>
        <Text style={styles.subtitle}>Contribuições na Guerra</Text>
        <Text style={styles.text}>
          Durante a Segunda Guerra Mundial, Turing trabalhou em Bletchley Park,
          onde desenvolveu a Bombe, máquina que decifrou o código Enigma usado
          pelos nazistas, encurtando a guerra em anos.
        </Text>
      </View>

      <View style={styles.section}>
        <Text style={styles.subtitle}>Máquina de Turing</Text>
        <Text style={styles.text}>
          Em 1936, propôs o conceito da Máquina de Turing, modelo teórico que
          fundamentou o desenvolvimento dos computadores modernos.
        </Text>
      </View>

      <View style={styles.section}>
        <Text style={styles.subtitle}>Teste de Turing</Text>
        <Text style={styles.text}>
          Em 1950, propôs o Teste de Turing para avaliar a inteligência artificial,
          ainda hoje usado como referência em IA.
        </Text>
      </View>

      <View style={styles.section}>
        <Text style={styles.subtitle}>Perseguição e Morte</Text>
        <Text style={styles.text}>
          Em 1952, foi condenado por homossexualidade (então crime no Reino Unido).
          Aceitou tratamento hormonal como alternativa à prisão. Faleceu em 7 de
          junho de 1954, possivelmente por suicídio.
        </Text>
      </View>

      <View style={styles.footer}>
        <Text style={styles.quote}>
          "Só podemos ver um pouco do futuro, mas o suficiente para perceber
          que há muito a fazer." - Alan Turing
        </Text>
      </View>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  container: {
    padding: 20,
    backgroundColor: '#f0f0f0',
  },
  header: {
    alignItems: 'center',
    marginBottom: 30,
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    color: '#333',
    marginBottom: 15,
    textAlign: 'center',
  },
  image: {
    width: 200,
    height: 200,
    borderRadius: 100,
    marginBottom: 20,
  },
  section: {
    backgroundColor: 'white',
    borderRadius: 10,
    padding: 15,
    marginBottom: 20,
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.1,
    shadowRadius: 5,
    elevation: 3,
  },
  subtitle: {
    fontSize: 18,
    fontWeight: '600',
    color: '#2c3e50',
    marginBottom: 10,
  },
  text: {
    fontSize: 16,
    lineHeight: 24,
    color: '#555',
  },
  footer: {
    marginTop: 20,
    padding: 15,
    backgroundColor: '#e8e8e8',
    borderRadius: 10,
  },
  quote: {
    fontStyle: 'italic',
    color: '#666',
    textAlign: 'center',
  },
});